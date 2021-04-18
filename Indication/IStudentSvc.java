package Indication;

import java.io.IOException;


//interface containing read and write file abstract methods
interface IStudentSvc
{
    public void writeToFIle(Student t) throws IOException;
    public Student readFromFile() throws IOException;

}

