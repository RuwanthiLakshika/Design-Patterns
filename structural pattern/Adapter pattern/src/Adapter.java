//import org.json.JSONObject;
//import org.json.XML;
//
//class Adapter {
//    private OldSystem oldSystem;
//
//    public Adapter(OldSystem oldSystem) {
//        this.oldSystem = oldSystem;
//    }
//
//    public String getEmployeeDataInJSON() {
//        String xmlData = oldSystem.getEmployeeDataInXML();
//        JSONObject jsonData = XML.toJSONObject(xmlData);
//        return jsonData.toString();
//    }
//}


// required org.json library is not available in project's classpath