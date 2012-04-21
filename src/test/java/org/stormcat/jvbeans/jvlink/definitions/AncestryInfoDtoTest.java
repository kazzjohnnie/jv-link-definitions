/*
 * Copyright 2009-2010 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.jvlink.definitions;

import org.junit.Test;
import org.stormcat.jvbeans.config.DataOption;
import org.stormcat.jvbeans.jvlink.definitions.dto.AncestryInfoDto;
import org.stormcat.jvbeans.jvlink.definitions.resolver.StoredDataResolver;

/**
 * @author a.yamada
 *
 */
public class AncestryInfoDtoTest extends DefinitionsTestBase<AncestryInfoDto> {

    @Test
    public void test() {
        storedTest(StoredDataResolver._BLOD()._BT(), "20100101000000", DataOption.STANDARD);
    }
}
