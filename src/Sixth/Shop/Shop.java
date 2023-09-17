package Sixth.Shop;


import java.util.ArrayList;
import java.util.Objects;

enum Computer{
    AMD("Bad Monitor", "Bad memory", "Good processor"),
    INTEL("Bad Monitor", "Bad memory", "Bad processor"),
    NVIDIA("Good Monitor", "Good memory", "Bad processor");

    Puter puter;
    Computer(String monitor, String memory, String processor){
        this.puter = new Puter(processor, memory, monitor);
    }

}

interface HardWare{
    public void hardWareNamePrint();
}

class Processor implements HardWare{
    public String name;

    public Processor(String name){
        this.name = name;
    }

    @Override
    public void hardWareNamePrint() {
        System.out.println("Processor " + this.name);
    }

    public String getName() {
        return name;
    }
}


class Memory implements HardWare{
    public String name;

    public Memory(String name){
        this.name = name;
    }

    @Override
    public void hardWareNamePrint() {
        System.out.println("Memory " + this.name);
    }

    public String getName() {
        return name;
    }
}

class Monitor implements HardWare{
    protected String name;

    public Monitor(String name){
        this.name = name;
    }

    @Override
    public void hardWareNamePrint() {
        System.out.println("Monitor " + this.name);
    }

    public String getName() {
        return name;
    }
}

class Puter{
    Monitor monitor;
    Memory memory;
    Processor processor;

    public Puter(String processor, String memory, String monitor){
        this.memory = new Memory(memory);
        this.monitor = new Monitor(monitor);
        this.processor = new Processor(processor);
    }

    public void getSpecs(){
        memory.hardWareNamePrint();
        monitor.hardWareNamePrint();
        processor.hardWareNamePrint();
    }

    public boolean CompareSpecs(String processor, String memory, String monitor){
        return Objects.equals(this.processor.getName(), processor) &&
                this.memory.getName().equals(memory) && this.monitor.getName().equals(monitor);
    }
}

class Shop {
    private ArrayList<Computer> puters = new ArrayList<Computer>();

    public void add(String name){
        switch (name){
            case "Nvidia" ->{
                puters.add(Computer.NVIDIA);
            }
            case "AMD" ->{
                puters.add(Computer.AMD);
            }
            case "Intel" ->{
                puters.add(Computer.INTEL);
            }
        }
    }

    public boolean findPuter(String processor, String memory, String monitor){
        for (int i = 0; i < puters.size(); i++){
            if (puters.get(i).puter.processor.getName().equals(processor) &&
                    puters.get(i).puter.memory.getName().equals(memory) &&
                    puters.get(i).puter.monitor.getName().equals(monitor)){
                return true;
            }
        }
        return false;
    }
}
