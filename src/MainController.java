public class MainController {
    private ServiceAdmin serviceAdmin = new ServiceAdminImple();
    private ObjectDeserialization objectDeserialization = new ObjectDeserialization();
    public void getAllStudents(){
        serviceAdmin.showAllTable(objectDeserialization);
    }
    public int studentsQuantity(){
        return objectDeserialization.getDataSize();
    }
}
