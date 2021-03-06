/*
 * Copyright 2016 the original author or authors.
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

package org.springframework.cloud.stream.binder.pubsub;

/**
 * @author Vinicius Carvalho
 */
public class PubsubConsumerProperties {

	private String prefix = "";
	private Integer fetchSize = 1;
	private Integer ackDeadlineSeconds = 10;
	private boolean returnImmediately;

	public boolean isReturnImmediately() {
		return returnImmediately;
	}

	public void setReturnImmediately(boolean returnImmediately) {
		this.returnImmediately = returnImmediately;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Integer getFetchSize() {
		return fetchSize;
	}

	public void setFetchSize(Integer fetchSize) {
		this.fetchSize = fetchSize;
	}

	public Integer getAckDeadlineSeconds() {
		return ackDeadlineSeconds;
	}

	public void setAckDeadlineSeconds(Integer ackDeadlineSeconds) {
		this.ackDeadlineSeconds = ackDeadlineSeconds;
	}
}
