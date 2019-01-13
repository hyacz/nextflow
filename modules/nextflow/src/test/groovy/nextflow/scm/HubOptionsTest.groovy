/*
 * Copyright 2013-2019, Centre for Genomic Regulation (CRG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nextflow.scm

import nextflow.cli.HubOptions
import spock.lang.Specification

/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class HubOptionsTest extends Specification {

    def testUser() {

        when:
        def cmd = [:] as HubOptions
        cmd.hubUser = credential
        then:
        cmd.getHubUser() == user
        cmd.getHubPassword() == password

        where:
        credential      | user  | password
        null            | null  | null
        'paolo'         | 'paolo'   | null
        'paolo:secret'  | 'paolo'   | 'secret'



    }
}