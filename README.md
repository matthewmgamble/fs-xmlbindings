When building an API server to handle requests from freeswitch via the fs_curl module in Java I discovered I needed a simple way to generate the required XML responses from Java. Finding no existing bindings or an XSD file to generate bindings from, I created these Java classes to fill the void.

Using JAXB and these classes, you can now generate fs_curl compatible responses.  Assuming you wanted to create a dialplan entry for 867-5309, you would do something like:

        JAXBContext jc = JAXBContext.newInstance(Document.class);
        Document fsDocument = new Document();
        Section section = new Section();
        Context context = new Context("public");
        Extension extension = new Extension("Jenny");
        Condition condition = new Condition("destination_number", "8675309");
        condition.addAction(new Action("playback", "file:///var/lib/sounds/jenny.wav"));
        extension.addCondition(condition);
        context.addExtension(extension);
        section.setContext(context);
        section.setName("dialplan");
        section.setDescription("jenny dialplan");
        fsDocument.setSection(section);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        java.io.StringWriter sw = new StringWriter();
        marshaller.marshal(fsDocument, sw);
        
And to get the XML back as a String, you can just call sw.toString() since it contains the marshalled output.

It's not the cleanest way to generate the XML as it results in quite verbose code, but it does cover all the components I needed and fills a void.  Pull requests welcome.
