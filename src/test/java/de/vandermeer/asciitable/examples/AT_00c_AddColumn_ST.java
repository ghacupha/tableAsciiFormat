/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
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

package de.vandermeer.asciitable.examples;

import org.stringtemplate.v4.ST;

import de.svenjacobs.loremipsum.LoremIpsum;
import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.examples.StandardExampleAsCmd;

/**
 * AsciiTable example demonstrating that {@link ST} objects are automatically added as text.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.3.2 build 170502 (02-May-17) for Java 1.8
 * @since      v0.0.3
 */
public class AT_00c_AddColumn_ST implements StandardExampleAsCmd {

	@Override
	public String getDescription() {
		return "add column from StringTemplate";
	}

	@Override
	public Object getLongDescription() {
		return
				"This example creates a simple ST object with some text, and adds it to a table."
		;
	}

	@Override
	public String getName() {
		return "col-st";
	}

	@Override
	public String getSource(){
		return
				"ST st = new ST(new LoremIpsum().getWords(10));\r\n" + 
				"AsciiTable at = new AsciiTable();\r\n" + 
				"at.addRule();\r\n" + 
				"at.addRow(st);\r\n" + 
				"at.addRule();\r\n" + 
				"System.out.println(at.render());"
		;
	}

	@Override
	public void showOutput(){
		// tag::example[]
		ST st = new ST(new LoremIpsum().getWords(10));
		AsciiTable at = new AsciiTable();
		at.addRule();
		at.addRow(st);
		at.addRule();
		System.out.println(at.render());
		// end::example[]
	}
}
