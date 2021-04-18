package Indication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//interface implementation
class IStudentSvclImpl implements IStudentSvc
{

    // write to file using file output stream and object write to write object data  to file
    @Override
    public void writeToFIle(Student t) throws IOException {
        // TODO Auto-generated method stub
        //here just i have added simple file name u can change file name and path according to your requirement
        try (FileOutputStream fos = new FileOutputStream("fileName.dat");
             ObjectOutputStream objectWrite = new ObjectOutputStream(fos)) {
            objectWrite.writeObject(t);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Student readFromFile() throws IOException {
        // TODO Auto-generated method stub
        try {

            FileInputStream fileIn = new FileInputStream("fileName.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("Read Object From File");
            objectIn.close();
            return (Student) obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}