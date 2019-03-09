# Command Line PDF Forms Filler

A simple Java command line PDF forms filler using an XML file to set the form values.

## Build the PDF Forms Filler

Use Maven 2 or Maven 3 to build the project:

```bash
mvn package
```

## Usage

### Parameters

<table>
    <tr>
        <th>Option</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>--template &lt;templatefile&gt;</td>
        <td>PDF file with form fields</td>
    </tr>
    <tr>
        <td>--target &lt;targetfile&gt;</td>
        <td>Target PDF file</td>
    </tr>
    <tr>
        <td>--xml &lt;xmlfile&gt;</td>
        <td>XML file containing form values</td>
    </tr>
    <tr>
        <td>--fonts &lt;fontspath&gt;</td>
        <td>Folder containing additional fonts, if required</td>
    </tr>
    <tr>
        <td>--verbose</td>
        <td>Output form field information</td>
    </tr>
    <tr>
        <td>--flatten</td>
        <td>Flatten the form fields</td>
    </tr>
</table>

### Run the Sample Provided

```bash
java -jar target/PdfForms_1.0-jar-with-dependencies.jar --template "sample/formtest.pdf" --xml "sample/fields.xml" --target "sample/formtest.output.pdf" --verbose --fonts "sample"
```

### XML File Format

To pass form values, you have to declare a simple XML file.

```xml
<fields>
	<!-- fill a text field with name “Address_1” -->
	<field>
		<key>Address_1</key>
		<type>field</type>
		<readonly>false</readonly>
		<value>Address Line 1</value>
	</field>
	<!-- fill a text field with name “Address_2” and set it to read-only -->
	<field>
		<key>Address_2</key>
		<type>field</type>
		<readonly>true</readonly>
		<value>Address Line 2 Readonly</value>
	</field>
	<!-- enable a checkbox with name “ASSOCIATES DEGREE” -->
	<field>
		<key>ASSOCIATES DEGREE</key>
		<type>field</type>
		<readonly>false</readonly>
		<value>On</value>
	</field>
	<!-- set a radio with name “Sex” to value “FEMALE” -->
	<field>
		<key>Sex</key>
		<type>field</type>
		<readonly>false</readonly>
		<value>FEMALE</value>
	</field>
	<!-- add a text using a custom font -->
	<field>
		<key/>
		<type>text</type>
		<readonly>false</readonly>
		<value>ABCDEF</value>
		<config>
			<size>50</size>
			<x>57</x>
			<y>780</y>
			<font>code_128.ttf</font>
		</config>
	</field>
</fields>
```

# License

Please note that the “PDF Forms Filler” is using the iText library, which requires you to buy a commercial license as soon as you develop activities involving the iText software without disclosing the source code of your own applications.

# Todo

* Provide jUnit tests.
