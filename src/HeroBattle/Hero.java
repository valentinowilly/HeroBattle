package HeroBattle;

public class Hero {
    // Field private untuk menyimpan nama, hp, attack, dan defense
    private String name;
    private double hp;
    private double attack;
    private double defense;

    // Konstruktor default(kosong)
    public Hero() {
    }

    // Konstruktor dengan parameter(Overloading Constructor)
    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // Membuat getter dan setter untuk masing-masing field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    // Method untuk serangan pertama 
    public void firstAttack(Hero player2, Hero player1){
        // Rumus perhitungan untuk tiap serangan
        player1.setHp(player1.getHp() - player2.getAttack() + player1.getDefense());
        if(player1.getHp() < 0){
            player1.setHp(0);
        }
        // Menampilkan informasi serangan pertama
        System.out.println(player2.getName() + " menyerang " + player1.getName() + "\n");
        System.out.println(player2.getName() + " menyerang sebesar " + player2.getAttack());
        System.out.println(player1.getName() + " memiliki pertahanan sebesar " + player1.getDefense());
        System.out.println("Health " + player1.getName() + " saat ini " + player1.getHp() + "\n");
        System.out.println("============================================");
        System.out.println("============================================");
    }

    // Method untuk serangan ronde berikutnya 
    public void nextAttack(Hero player1, Hero player2){
        // Rumus perhitungan untuk setiap serangan
        player2.setHp(player2.getHp() - player1.getAttack() + player2.getDefense());
        if(player2.getHp() < 0){
            player2.setHp(0);
        }
        // Menampilkan informasi serangan berikutnya
        System.out.println(player1.getName() + " menyerang " + player2.getName() + "\n");
        System.out.println(player1.getName() + " menyerang sebesar " + player1.getAttack());
        System.out.println(player2.getName() + " memiliki pertahanan sebesar " + player2.getDefense());
        System.out.println("Health " + player2.getName() + " saat ini " + player2.getHp() + "\n");
        System.out.println("============================================");
        System.out.println("============================================");
    }
}