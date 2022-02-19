/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.springbatch.tutorials.batch;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleBatchApplicationTests {

	@Rule
	public OutputCaptureRule outputCapture = new OutputCaptureRule();

	@Test
	public void testDefaultSettings() throws Exception {
		assertEquals(0, SpringApplication.exit(SpringApplication
				.run(SampleBatchApplication.class)));
		String output = this.outputCapture.toString();
		assertTrue("Wrong output: " + output,
				output.contains("completed with the following parameters"));
	}

}
