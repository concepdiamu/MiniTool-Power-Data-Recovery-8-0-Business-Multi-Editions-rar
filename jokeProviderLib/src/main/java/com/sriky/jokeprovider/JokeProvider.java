/*
 * Copyright (C) 2017 Srikanth Basappa
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
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.sriky.jokeprovider;

import java.util.concurrent.ThreadLocalRandom;

public class JokeProvider {

    private static final String[] JOKES = {
            "A Mexican magician says he will disappear on the count of 3. He says \"uno, dos...\" poof. He disappeared without a tres.",
            "The Secret Service just had to change protocol for when the president is in danger. Instead of yelling \"get down!\", they have to yell \"Donald, duck!\"",
            "How does a rabbi make his coffee?\n - Hebrews it.",
            "What do you call a dog that does magic tricks?\n - A labracadabrador.",
            "Dr Frankenstein entered a body building contest. Upon arrival he realised he misunderstood the objective."};

    private static final String POWERED_BY = ": Powered by[JokeTeller JavaLib]";

    /**
     * Get a joke.
     *
     * @return A funny joke.
     */
    public String getJoke() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
        return JOKES[randomNum] + POWERED_BY;
    }
}
