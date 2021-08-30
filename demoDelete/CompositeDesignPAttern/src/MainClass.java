/**structural Design pattern
 **/
public class MainClass {
    public static void main(String a[])
    {

        /**
         * Architechture of this Composite Design pattern
         * Computer -> Peripheral & Cabinet
         * Cabinet -> HardDisk & MotherBoard
         * MotherBoard -> Cpu & Ram
         * Peripheral -> mouse & Monitor
         */
        /** Leaf Objects **/
        Component hardDisk = new Leaf(4000, "HDD HardDisk");
        Component mouse = new Leaf(3000, "Mouse");
        Component monitor = new Leaf(2000, "Monitor");
        Component ram = new Leaf(1000, "Ram");
        Component cpu = new Leaf(500, "Cpu");

        /** Composite Objects **/
        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hardDisk);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

       // ram.showPrice();
        computer.showPrice();

    }
}
