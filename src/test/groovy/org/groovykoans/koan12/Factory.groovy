/**
 * Copyright 2012-2014 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.groovykoans.koan12

class Factory {

    def numbers;
    def worker;

    // defaults to a Hard (and slow) Worker implementation
    Factory(worker = new HardWorker(), def numbers) {
        this.numbers = numbers;
        this.worker = worker;
    }

    def work() {
        numbers.collect {
            worker.work(it)
        }
    }

}
