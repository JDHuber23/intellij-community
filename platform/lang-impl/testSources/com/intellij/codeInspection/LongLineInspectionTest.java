/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.codeInspection;

import com.intellij.codeInspection.ex.LocalInspectionToolWrapper;
import com.intellij.testFramework.PlatformTestUtil;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;

import java.io.File;

/**
 * @author Dmitry Batkovich
 */
public class LongLineInspectionTest extends LightPlatformCodeInsightFixtureTestCase {

  public void testJavaShortLine() {
    doTest();
  }

  public void testJavaLongLine() {
    doTest();
  }

  public void testXmlLongLine() {
    doTest();
  }

  private void doTest() {
    myFixture.testInspection(getTestName(true), new LocalInspectionToolWrapper(new LongLineInspection()));
  }

  @Override
  protected String getTestDataPath() {
    return PlatformTestUtil.getCommunityPath().replace(File.separatorChar, '/') + "/platform/lang-impl/testData/codeInspection/longLine/";
  }

  @Override
  protected boolean isWriteActionRequired() {
    return false;
  }
}
