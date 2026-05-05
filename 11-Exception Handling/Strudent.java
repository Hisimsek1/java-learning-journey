public class Strudent {
    public Student find(String id) throws StudentException{
        if("abc".equals(id))
        {
            return new Student(id, 0, 0);
        }else 
        { 
            throw new StudentException("Ogrenci bulunamadi");
        }
    }
}
