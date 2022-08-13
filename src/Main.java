public class Main {

    public static void main(String[] args) {

        MagicBox<Integer> magicBoxI = new MagicBox<>();
        System.out.print(magicBoxI.add(10) + ", "  // Здесь всё как надо
                + magicBoxI.add(20) + ", "
                + magicBoxI.add(30) + ", "
                + magicBoxI.add(40) + ", "
                + "[ " + magicBoxI.pick() + " ]" + "\n");

        MagicBox<String> magicBoxM = new MagicBox<>();
        System.out.print(magicBoxM.add("one") + ", "
                + magicBoxM.add("four") + ", "
                + magicBoxM.add("pig") + ", "
                + magicBoxM.add("man") + ", "
                + magicBoxM.add("cow") + ", "  // Здесь у нас лишняя ячейка которая не влезет
                + "[ " + magicBoxM.pick() + " ]" + "\n");

        MagicBox<String> magicBoxS = new MagicBox<>();
        System.out.print(magicBoxS.add("one") + ", "
//                + magicBoxS.add("four") + ", " // Считаем что 3 ячейки не заполнены
//                + magicBoxS.add("pig") + ", "  // RuntimeException должен выдать что
//                + magicBoxS.add("man") + ", "  // 3 ячейки пусты
                + "[ " + magicBoxS.pick() + " ]");
    }
}
