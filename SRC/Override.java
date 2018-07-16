/**
 *
 * @author Lucas
 */
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Course course = new Course("IT3349",3,"Intermediate Java");
        System.out.print(course);
        
        FlexPathCourse flex = new FlexPathCourse("IT2230",3,"Intro to Database Systems");
        System.out.print(flex);
        
        GuidedPathCourse guided = new GuidedPathCourse("IT4789",3,"Mobile Cloud");
        System.out.print(guided);
    }
    
}

class Course {
    protected String code;
    protected int creditHours;
    protected String title;
    
    public Course(String code,int creditHours, String title) {
       this.code = code;
       this.creditHours = creditHours;
       this.title = title;
    }
    
    @java.lang.Override
    public String toString() {
        return String.format("Class Name\tCode\t Credit Hrs\tTitle\nCourse\t\t%s\t      %d\t\t%s\n",code,creditHours,title);
    }  
}

class FlexPathCourse extends Course {
    protected String optionalResources;
    public FlexPathCourse(String code,int creditHours,String title){
        super(code,creditHours,title);
    }
    
    @java.lang.Override
    public String toString(){
        return String.format("Flex Path\t\t%s\t      %d\t\t%s\n",code,creditHours,title);
    }
    
}

class GuidedPathCourse extends Course{
    protected int duration;
    protected String requiredResources;
    public GuidedPathCourse(String code,int creditHours,String title){
        super(code,creditHours,title);
    }
    
    @java.lang.Override
    public String toString(){
        return String.format("Guided Path\t%s\t      %d\t\t%s\n",code,creditHours,title);
    }
}




