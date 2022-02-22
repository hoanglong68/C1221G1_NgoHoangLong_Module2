package ss5_access_modifier_and_static.bai_tap.build_write_only;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Long");
        student.setClasses("C1221G1");
    }
}
// thay đổi 2 access modifier của 2 method từ public sang default thì vẫn chạy được vì có cùng package