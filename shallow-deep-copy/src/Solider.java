    public class Solider {
    private String name;
    private int age;
    Gun gun;

    public Solider(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Solider(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
       //我们创建的p1
        Solider p1 = new Solider("Tom",27);
        p1.gun = new Gun("Lady");

        //我们对p1进行一次`拷贝`
        Solider p2 = new Solider(); //新Soldier

        String newName = new String(p1.getName());
        p2.setName(newName);

        int newAge = p1.getAge();
        p2.setAge(newAge);

        Gun newGun = new Gun();
        String newGunName = new String(p1.gun.getName());
        p2.gun = newGun;
        newGun.setName(newGunName);

        System.out.println(p1 == p2);
        System.out.println(p1.getName() == p2.getName());
        System.out.println(p1.getAge()  == p2.getAge());
        System.out.println(p1.gun == p2.gun);
        System.out.println(p1.gun.getName() == p2.gun.getName());
    }
}
