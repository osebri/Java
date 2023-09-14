/** @author: omar sebri 3722350 */
public class ClassList{

    private StudentNode front,end;
    private int size;

    public ClassList(){
        this.front = null;
        this.end = null;
        this.size=0;
    }

    public void add(Student stud){
        StudentNode newNode = new StudentNode(stud);
        boolean inserted = false;
        if(this.front==null){
            this.front= newNode;
            this.end=newNode;
            size+=1;
        }
        else{
            StudentNode temp = this.front;

        while(newNode.data.compareTo(temp.data)>0 && temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null || (this.size==1 && newNode.data.compareTo(temp.data)<0 )){
            temp.next=newNode;
            //temp.prev.next=newNode;
            newNode.prev=temp;
            this.end=newNode;
            size+=1;
        }
        else{
            /*newNode.next=temp;
            newNode.prev=temp.prev;
            temp.prev=newNode;*/
            newNode.next=temp;
            newNode.prev=temp.prev;
            temp.prev.next=newNode;
            temp.prev=newNode;
            size+=1;
        }
    }
        /*else{
            StudentNode temp = this.front;
            while(temp.next!=null){
                if(newNode.data.compareTo(temp.data)<0){
                    newNode.prev=temp.prev;
                    newNode.next=temp;
                    temp.prev=newNode;
                    size+=1;
                    inserted=true;
                 
                }
                temp=temp.next;
                }
            if(temp.next==null&&!inserted){
                if(newNode.data.compareTo(temp.data)<0){
                    newNode.prev=temp.prev;
                    newNode.next=temp;
                    temp.prev=newNode;
                    //this.end=temp;
                    size+=1;
                }
                else if(newNode.data.compareTo(temp.data)>0){
                    newNode.prev=temp;
                    temp.next=newNode;
                    this.end=newNode;
                    size+=1;
                }                
            }
            
        }
        /*else if(this.size==1){
            if(stud.compareTo(this.front.data)>0){
                this.end.next=newNode;

            }
            else if(stud.compareTo(this.front.data)<0){
                this.end.data=this.front.data;
                this.front.data=stud.data;
                size+=1;
            }
        }*/
    }
    public void printer(){
        StudentNode temp = front;
        while(temp!=null){
            System.out.println(temp.data.toString());
            temp=temp.next;
        }
    }
    public Student[] getReveresedList(){
        Student[] array = new Student[this.size];
        StudentNode temp = end;
        int i=0;
        while(temp!=null){
            array[i]=temp.data;
            i++;
            temp=temp.prev;
        }
        return array;
    }
 public void remove(Student studentOut){
     StudentNode temp = front;
     boolean done =true;
     while(temp!=null){
         if(temp.data.get_StudId()==studentOut.get_StudId()){
                if (temp.prev != null){
                    temp.prev.next = temp.next;
                    done = true; }
                else{
                    front = temp.next;
                    done=true; }
                if (temp.next != null){
                    temp.next.prev = temp.prev;
                    done=true; }
                else{
                    end = temp.prev;
                    done=true; }
         }
         temp=temp.next;
     }
     size-=1;
 }
    public int getNumStudent(){
        return this.size;
    }

    private class StudentNode{
        public Student data;
        public StudentNode next;
        public StudentNode prev;
        public StudentNode(Student dataIn){
            this.data= dataIn;
            this.next=null;
            this.prev=null;
        }
    }
    
}