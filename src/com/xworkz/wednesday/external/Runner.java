package com.xworkz.wednesday.external;

import com.xworkz.wednesday.internal.*;


public class Runner {
    public static void main(String[] args) {

        Student student = new Student(21, "Shashank", 21);
        System.out.println("Representation of Student : " + student);
        System.out.println("generated code is : "+System.identityHashCode(student));
        System.out.println("defined code is : "+student.hashCode());


        Car car = new Car("toyoto", "camry", 2020);
        System.out.println("Representation of Car : " + car);
        System.out.println("generated code is : "+System.identityHashCode(car));
        System.out.println("defined code is : "+car.hashCode());



        Book book = new Book("Anabelle", "george", 328);
        System.out.println("Representation of Book : " + book);
        System.out.println("generated code is : "+System.identityHashCode(book));
        System.out.println("defined code is : "+book.hashCode());



        Teacher teacher = new Teacher("Khushi", "Maths", 55000.0);
        System.out.println("Representation of Teacher : + teacher");
        System.out.println("generated code is : "+System.identityHashCode(teacher));
        System.out.println("defined code is : "+teacher.hashCode());



        Laptop laptop = new Laptop("Dell", "i7", 16);
        System.out.println("Representation of Laptop : + laptop");
        System.out.println("generated code is : "+System.identityHashCode(laptop));
        System.out.println("defined code is : "+laptop.hashCode());


        House house = new House("123 main street bangalore", 3, 4);
        System.out.println("Representation of House : + house");
        System.out.println("generated code is : "+System.identityHashCode(house));
        System.out.println("defined code is : "+house.hashCode());


        Cat cat = new Cat("siamese", "cream", 4);
        System.out.println("Representation of Cat : + cat");
        System.out.println("generated code is : "+System.identityHashCode(cat));
        System.out.println("defined code is : "+cat.hashCode());


        Airplane airplane = new Airplane("boeing 747", 416, "delta");
        System.out.println("Representation of Airplane : + airplane");
        System.out.println("generated code is : "+System.identityHashCode(airplane));
        System.out.println("defined code is : "+airplane.hashCode());


        Movie movie = new Movie("Inception", "sci-fi", 148);
        System.out.println("Representation of Movie : + movie");
        System.out.println("generated code is : "+System.identityHashCode(student));
        System.out.println("defined code is : "+student.hashCode());



        City city = new City("Paris", 86435678, "France");
        System.out.println("Representation of City : + city");
        System.out.println("generated code is : "+System.identityHashCode(city));
        System.out.println("defined code is : "+city.hashCode());



        Job job = new Job("Software Engineer", "Techcrop", 95000);
        System.out.println("Representation of Job : + job");
        System.out.println("generated code is : "+System.identityHashCode(job));
        System.out.println("defined code is : "+job.hashCode());



        Chair chair = new Chair("Wood", 4, "brown");
        System.out.println("Representation of Chair : + chair");
        System.out.println("generated code is : "+System.identityHashCode(chair));
        System.out.println("defined code is : "+chair.hashCode());



        Keyboard keyboard = new Keyboard("Mechanical", "logitech", 106);
        System.out.println("Representation of Keyboard : + keyboard");
        System.out.println("generated code is : "+System.identityHashCode(keyboard));
        System.out.println("defined code is : "+keyboard.hashCode());



        Mouse mouse = new Mouse("Razer", 16000, true);
        System.out.println("Representation of Mouse : + mouse");
        System.out.println("generated code is : "+System.identityHashCode(mouse));
        System.out.println("defined code is : "+mouse.hashCode());


        Oven oven = new Oven("Bosch", 2000, "Electric");
        System.out.println("Representation of Oven : + oven");
        System.out.println("generated code is : "+System.identityHashCode(oven));
        System.out.println("defined code is : "+oven.hashCode());



        Monitor monitor = new Monitor("hp", 24.0, "1920x1000");
        System.out.println("Representation of Monitor : + monitor");
        System.out.println("generated code is : "+System.identityHashCode(monitor));
        System.out.println("defined code is : "+monitor.hashCode());



        Webcam webcam = new Webcam("Logitech", 1080, true);
        System.out.println("Representation of Webcam : + webcam");
        System.out.println("generated code is : "+System.identityHashCode(webcam));
        System.out.println("defined code is : "+webcam.hashCode());



        Headphones headphones = new Headphones("Bose", true, "Over-ear");
        System.out.println("Representation of Headphones : + headphones");
        System.out.println("generated code is : "+System.identityHashCode(headphones));
        System.out.println("defined code is : "+headphones.hashCode());



        Camera camera = new Camera("Canon", 24, true);
        System.out.println("Representation of Camera : + camera");
        System.out.println("generated code is : "+System.identityHashCode(camera));
        System.out.println("defined code is : "+camera.hashCode());



        Smartphone smartphone = new Smartphone("Samsung", "galaxy s21", 128);
        System.out.println("Representation of Smartphone : + smartphone");
        System.out.println("generated code is : "+System.identityHashCode(smartphone));
        System.out.println("defined code is : "+smartphone.hashCode());



        Tablet tablet = new Tablet("Apple", 10.2, true);
        System.out.println("Representation of Tablet : + tablet");
        System.out.println("generated code is : "+System.identityHashCode(tablet));
        System.out.println("defined code is : "+tablet.hashCode());


        Printer printer = new Printer("HP", true, 20);
        System.out.println("Representation of Printer : + printer");
        System.out.println("generated code is : "+System.identityHashCode(printer));
        System.out.println("defined code is : "+printer.hashCode());



        Speaker speaker = new Speaker("Sony", 30, true);
        System.out.println("Representation of Speaker : + speaker");
        System.out.println("generated code is : "+System.identityHashCode(speaker));
        System.out.println("defined code is : "+speaker.hashCode());



        Router router = new Router("TP-Link", 50, true);
        System.out.println("Representation of Router : + router");
        System.out.println("generated code is : "+System.identityHashCode(router));
        System.out.println("defined code is : "+router.hashCode());



        Scanner scanner = new Scanner("Canon", 1250, true);
        System.out.println("Representation of Scanner : + scanner");
        System.out.println("generated code is : "+System.identityHashCode(scanner));
        System.out.println("defined code is : "+scanner.hashCode());



        Projector projector = new Projector("Epson", 3000, true);
        System.out.println("Representation of Projector : + projector");
        System.out.println("generated code is : "+System.identityHashCode(projector));
        System.out.println("defined code is : "+projector.hashCode());



        Tv tv = new Tv("Samsung", 55, true);
        System.out.println("Representation of Tv : + tv");
        System.out.println("generated code is : "+System.identityHashCode(tv));
        System.out.println("defined code is : "+tv.hashCode());



        SmartWatch smartWatch = new SmartWatch("Apple", true, 18);
        System.out.println("Representation of SmartWatch : + smartwatch");
        System.out.println("generated code is : "+System.identityHashCode(smartWatch));
        System.out.println("defined code is : "+smartWatch.hashCode());



        GameConsole gameConsole = new GameConsole("nintendo", "switch", true);
        System.out.println("Representation of GameConsole : + gameConsole");
        System.out.println("generated code is : "+System.identityHashCode(gameConsole));
        System.out.println("defined code is : "+gameConsole.hashCode());



        PowerBank powerBank = new PowerBank("MI", 20000, 2);
        System.out.println("Representation of PowerBank : + powerBank");
        System.out.println("generated code is : "+System.identityHashCode(powerBank));
        System.out.println("defined code is : "+powerBank.hashCode());



        Drone drone = new Drone("Phantom ", 7.0, true);
        System.out.println("Representation of Drone : + drone");
        System.out.println("generated code is : "+System.identityHashCode(drone));
        System.out.println("defined code is : "+drone.hashCode());



        BluetoothSpeaker bluetoothspeaker = new BluetoothSpeaker("JBL ", 3000, true);
        System.out.println("Representation of BluetoothSpeaker : + bluetoothSpeaker");
        System.out.println("generated code is : "+System.identityHashCode(bluetoothspeaker));
        System.out.println("defined code is : "+bluetoothspeaker.hashCode());



        VRHeadset vrHeadset = new VRHeadset("Meta ", true, 110);
        System.out.println("Representation of VRHeadset : + vrHeadset");
        System.out.println("generated code is : "+System.identityHashCode(vrHeadset));
        System.out.println("defined code is : "+vrHeadset.hashCode());



        Truck truck = new Truck("Ford ", 3500, true);
        System.out.println("Representation of Truck : + truck");
        System.out.println("generated code is : "+System.identityHashCode(truck));
        System.out.println("defined code is : "+truck.hashCode());



        ElectricScooter electricScooter = new ElectricScooter("Ola ", 90, 146);
        System.out.println("Representation of ElectricScooter : + electricScooter");
        System.out.println("generated code is : "+System.identityHashCode(student));
        System.out.println("defined code is : "+student.hashCode());



        Bus bus = new Bus("KSRTC ", 45, true);
        System.out.println("Representation of Bus : + bus");
        System.out.println("generated code is : "+System.identityHashCode(bus));
        System.out.println("defined code is : "+bus.hashCode());



        Boat boat = new Boat("Yacht ", 30, true);
        System.out.println("Representation of Boat : + boat");
        System.out.println("generated code is : "+System.identityHashCode(boat));
        System.out.println("defined code is : "+boat.hashCode());



        Helicopter helicopter = new Helicopter("Apache ", 5, true);
        System.out.println("Representation of Helicopter : + helicopter");
        System.out.println("generated code is : "+System.identityHashCode(helicopter));
        System.out.println("defined code is : "+helicopter.hashCode());


        Course course = new Course("java ", 8, true);
        System.out.println("Representation of Course : + course");
        System.out.println("generated code is : "+System.identityHashCode(course));
        System.out.println("defined code is : "+course.hashCode());



        Television television = new Television("LED", 55, true);
        System.out.println("Representation of Television : + television");
        System.out.println("generated code is : "+System.identityHashCode(television));
        System.out.println("defined code is : "+television.hashCode());



        ExternalHardDrive externalHardDrive = new ExternalHardDrive("Seagate", 1000, "USB");
        System.out.println("Representation of ExternalHardDrive : + externalHardDrive");
        System.out.println("generated code is : "+System.identityHashCode(externalHardDrive));
        System.out.println("defined code is : "+externalHardDrive.hashCode());



        AirConditioner airConditioner = new AirConditioner("LG", 1, true);
        System.out.println("Representation of AirConditioner : + airConditioner");
        System.out.println("generated code is : "+System.identityHashCode(airConditioner));
        System.out.println("defined code is : "+airConditioner.hashCode());



        Microwave microwave = new Microwave("IFB", 900, true);
        System.out.println("Representation of MicroWave : + microWave");
        System.out.println("generated code is : "+System.identityHashCode(microwave));
        System.out.println("defined code is : "+microwave.hashCode());



        WaterHeater waterHeater = new WaterHeater("Racold", 15, false);
        System.out.println("Representation of WaterHeater: + WaterHeater");
        System.out.println("generated code is : "+System.identityHashCode(waterHeater));
        System.out.println("defined code is : "+waterHeater.hashCode());



        WashingMachine washingMachine = new WashingMachine("Bosch", 7, true);
        System.out.println("Representation of WashingMachine: + WashingMachine");
        System.out.println("generated code is : "+System.identityHashCode(washingMachine));
        System.out.println("defined code is : "+washingMachine.hashCode());



        WaterPurifier waterPurifier = new WaterPurifier("kent", 8, true);
        System.out.println("Representation of WaterPurifier: + waterPurifier");
        System.out.println("generated code is : "+System.identityHashCode(waterPurifier));
        System.out.println("defined code is : "+waterPurifier.hashCode());



        CoffeeMachine coffeeMachine = new CoffeeMachine("kent", 8, true);
        System.out.println("Representation of CoffeeMachine: + coffeeMachine");
        System.out.println("generated code is : "+System.identityHashCode(coffeeMachine));
        System.out.println("defined code is : "+coffeeMachine.hashCode());



        Toaster toaster = new Toaster("Philips", 8, true);
        System.out.println("Representation of Toaster: + toaster");
        System.out.println("generated code is : "+System.identityHashCode(toaster));
        System.out.println("defined code is : "+tablet.hashCode());


        MixerGrinder mixerGrinder = new MixerGrinder("Philips", 8, 750);
        System.out.println("Representation of MixGrinder: + mixGrinder");
        System.out.println("generated code is : "+System.identityHashCode(mixerGrinder));
        System.out.println("defined code is : "+mixerGrinder.hashCode());



        ElectricKettle electricKettle = new ElectricKettle("Havells", 1.5, true);
        System.out.println("Representation of ElectricKettle: + electricKettle");
        System.out.println("generated code is : "+System.identityHashCode(electricKettle));
        System.out.println("defined code is : "+electricKettle.hashCode());



        CeilingFan ceilingFan = new CeilingFan("Crompton", 380, true);
        System.out.println("Representation of CeilingFan : + ceilingFan");
        System.out.println("generated code is : "+System.identityHashCode(ceilingFan));
        System.out.println("defined code is : "+ceilingFan.hashCode());



        InductionCookTop inductionCookTop = new InductionCookTop("Pigeon", 1600, 6);
        System.out.println("Representation of InductionCookTop: + inductionCookTop");
        System.out.println("generated code is : "+System.identityHashCode(inductionCookTop));
        System.out.println("defined code is : "+inductionCookTop.hashCode());


        SandwichMaker sandwichMaker = new SandwichMaker("Richards", 2, true);
        System.out.println("Representation of SandwichMaker: + sandwichMaker");
        System.out.println("generated code is : "+System.identityHashCode(sandwichMaker));
        System.out.println("defined code is : "+sandwichMaker.hashCode());



        AirFryer airFryer = new AirFryer("Philips", 4.1, true);
        System.out.println("Representation of AirFryer: + airFryer");
        System.out.println("generated code is : "+System.identityHashCode(airFryer));
        System.out.println("defined code is : "+airFryer.hashCode());



        HairDryer hairDryer = new HairDryer("Vega", 1200, true);
        System.out.println("Representation of HairDryer: + hairDryer");
        System.out.println("generated code is : "+System.identityHashCode(hairDryer));
        System.out.println("defined code is : "+hairDryer.hashCode());



        BeardTrimmer beardTrimmer = new BeardTrimmer("Vega", 1200, true);
        System.out.println("Representation of BeardTrimmer: + beardTrimmer");
        System.out.println("generated code is : "+System.identityHashCode(beardTrimmer));
        System.out.println("defined code is : "+beardTrimmer.hashCode());



        HairStraightener hairStraightener = new HairStraightener("Remington", 230, true);
        System.out.println("Representation of HairStraightener: + hairStraightener");
        System.out.println("generated code is : "+System.identityHashCode(hairStraightener));
        System.out.println("defined code is : "+hairStraightener.hashCode());



        FitnessTracker fitnessTracker = new FitnessTracker("Fitbit", true, 7);
        System.out.println("Representation of FitnessTracker: + fitnessTracker");
        System.out.println("generated code is : "+System.identityHashCode(fitnessTracker));
        System.out.println("defined code is : "+fitnessTracker.hashCode());



        WirelessCharger wirelessCharger = new WirelessCharger("Samsung",15,true);
        System.out.println("Representation of WirelessCharger: + wirelessCharger");
        System.out.println("generated code is : "+System.identityHashCode(wirelessCharger));
        System.out.println("defined code is : "+wirelessCharger.hashCode());



        ActionCamera actionCamera = new ActionCamera("Go pro",true,1080);
        System.out.println("Representation of ActionCamera: + actionCamera");
        System.out.println("generated code is : "+System.identityHashCode(actionCamera));
        System.out.println("defined code is : "+actionCamera.hashCode());



        SmartPlug smartPlug = new SmartPlug("TP-link",true,1800);
        System.out.println("Representation of SmartPlug: + SmartPlug");
        System.out.println("generated code is : "+System.identityHashCode(smartPlug));
        System.out.println("defined code is : "+smartPlug.hashCode());



        EBookReader eBookReader = new EBookReader("Kindle",8,true);
        System.out.println("Representation of EBookReader: + eBookReader");
        System.out.println("generated code is : "+System.identityHashCode(eBookReader));
        System.out.println("defined code is : "+eBookReader.hashCode());



        PortableProjector portableProjector = new PortableProjector("Anker",200,true);
        System.out.println("Representation of PortableProjector: + PortableProjector");
        System.out.println("generated code is : "+System.identityHashCode(portableProjector));
        System.out.println("defined code is : "+portableProjector.hashCode());



        SmartDoorLocker smartDoorLocke = new SmartDoorLocker("Yale",true,true);
        System.out.println("Representation of SmartDoorLocker: + smartDoorLocker");
        System.out.println("generated code is : "+System.identityHashCode(smartDoorLocke));
        System.out.println("defined code is : "+smartDoorLocke.hashCode());



        SmartThermostat smartThermostat= new SmartThermostat("Nest",true,30);
        System.out.println("Representation of SmartThermostat: + smartThermostat");
        System.out.println("generated code is : "+System.identityHashCode(smartThermostat));
        System.out.println("defined code is : "+smartThermostat.hashCode());



        GamingMouse gamingMouse= new GamingMouse("Logitech",16000,true);
        System.out.println("Representation of GamingMouse: + gamingMouse");
        System.out.println("generated code is : "+System.identityHashCode(gamingMouse));
        System.out.println("defined code is : "+gamingMouse.hashCode());



        GamingHeadset gamingHeadset= new GamingHeadset("HyperX",true,true);
        System.out.println("Representation of GamingHeadset: + gamingHeadset");
        System.out.println("generated code is : "+System.identityHashCode(gamingHeadset));
        System.out.println("defined code is : "+gamingHeadset.hashCode());


        SolarBackpack solarBackpack= new SolarBackpack("Solgaard",10,true);
        System.out.println("Representation of SolarBackpack: + solarBackpack");
        System.out.println("generated code is : "+System.identityHashCode(solarBackpack));
        System.out.println("defined code is : "+scanner.hashCode());



        DigitalTatoo digitalTatoo= new DigitalTatoo("Dragon",true,48);
        System.out.println("Representation of DigitalTatoo: + digitalTatoo");
        System.out.println("generated code is : "+System.identityHashCode(digitalTatoo));
        System.out.println("defined code is : "+digitalTatoo.hashCode());


        SmartMug SmartMug= new SmartMug("Ember",57,true);
        System.out.println("Representation of SmartMug: + SmartMug");
        System.out.println("generated code is : "+System.identityHashCode(SmartMug));
        System.out.println("defined code is : "+SmartMug .hashCode());



        VirtualPet virtualPet= new VirtualPet("Pixel","cat",85);
        System.out.println("Representation of VirtualPet: + virtualPet");
        System.out.println("generated code is : "+System.identityHashCode(virtualPet));
        System.out.println("defined code is : "+virtualPet.hashCode());


        EInkNotebook eInkNotebook= new EInkNotebook("Remarkable" ,1000,true);
        System.out.println("Representation of EInkNotebook: + eInkNotebook");
        System.out.println("generated code is : "+System.identityHashCode(eInkNotebook));
        System.out.println("defined code is : "+eInkNotebook.hashCode());



        AIChessBoard aIChessBoard= new AIChessBoard("walnut" ,true,10);
        System.out.println("Representation of AIChessBoard: + aIChessBoard");
        System.out.println("generated code is : "+System.identityHashCode(aIChessBoard));
        System.out.println("defined code is : "+aIChessBoard.hashCode());


        AirPurifyingMask airPurifyingMask= new AirPurifyingMask("atmoblue" ,true,12);
        System.out.println("Representation of AirPurifyingMask: + airPurifyingMask");
        System.out.println("generated code is : "+System.identityHashCode(airPurifyingMask));
        System.out.println("defined code is : "+airPurifyingMask.hashCode());

        MoodLamp moodLamp= new MoodLamp("purple" ,75,true);
        System.out.println("Representation of MoodLamp: + moodLamp");
        System.out.println("generated code is : "+System.identityHashCode(moodLamp));
        System.out.println("defined code is : "+moodLamp.hashCode());


        GestureController gestureController= new GestureController("wavecontrol" ,80,false);
        System.out.println("Representation of GestureController: + gestureController");
        System.out.println("generated code is : "+System.identityHashCode(gestureController));
        System.out.println("defined code is : "+gestureController.hashCode());



        SmartPlantPot smartPlantPot= new SmartPlantPot("bonsai" ,true,68);
        System.out.println("Representation of SmartPlantPot: + smartPlantPot");
        System.out.println("generated code is : "+System.identityHashCode(smartPlantPot));
        System.out.println("defined code is : "+smartPlantPot.hashCode());


        Biometricwallet biometricwallet= new Biometricwallet("black" ,true,20);
        System.out.println("Representation of Biometricwallet: +biometricwallet");
        System.out.println("generated code is : "+System.identityHashCode(biometricwallet));
        System.out.println("defined code is : "+biometricwallet.hashCode());



        DigitalShoe digitalShoe= new DigitalShoe("FitX pro" ,12500,true);
        System.out.println("Representation of DigitalShoe: +digitalShoe");
        System.out.println("generated code is : "+System.identityHashCode(digitalShoe));
        System.out.println("defined code is : "+digitalShoe.hashCode());



        HologramDisplay hologramDisplay= new HologramDisplay("4" ,true,7.5);
        System.out.println("Representation of HologramDisplay: +hologramDisplay");
        System.out.println("generated code is : "+System.identityHashCode(hologramDisplay));
        System.out.println("defined code is : "+hologramDisplay.hashCode());



        SmartRing smartRing= new SmartRing("Titanium" ,true,5);
        System.out.println("Representation of SmartRing: +smartRing");
        System.out.println("generated code is : "+System.identityHashCode(smartRing));
        System.out.println("defined code is : "+smartRing.hashCode());



        SmartMugWarmer smartMugWarmer= new SmartMugWarmer(60 ,true,"white");
        System.out.println("Representation of SmartMugWarmer: +smartMugWarmer");
        System.out.println("generated code is : "+System.identityHashCode(smartMugWarmer));
        System.out.println("defined code is : "+smartMugWarmer.hashCode());



        FoldableKeyboard foldableKeyboard = new FoldableKeyboard("QUWERTY" ,true,8);
        System.out.println("Representation of FoldableKeyboard: +foldableKeyboard");
        System.out.println("generated code is : "+System.identityHashCode(foldableKeyboard));
        System.out.println("defined code is : "+foldableKeyboard.hashCode());



        DigitalCompass digitalCompass = new DigitalCompass("Navpoint" ,true,0.5);
        System.out.println("Representation of DigitalCompass: +digitalCompass");
        System.out.println("generated code is : "+System.identityHashCode(digitalCompass));
        System.out.println("defined code is : "+digitalCompass.hashCode());



        SmartCoaster smartCoaster= new SmartCoaster(true ,"cork",true);
        System.out.println("Representation of SmartCoaster: +smartCoaster");
        System.out.println("generated code is : "+System.identityHashCode(smartCoaster));
        System.out.println("defined code is : "+smartCoaster.hashCode());



        DigitalThermometer DigitalThermometer= new DigitalThermometer(98 ,true,"bluetooth");
        System.out.println("Representation of DigitalThermometer: +DigitalThermometer");
        System.out.println("generated code is : "+System.identityHashCode(DigitalThermometer));
        System.out.println("defined code is : "+DigitalThermometer.hashCode());



        FitnessMirror FitnessMirror= new FitnessMirror("mirrorfit" ,180,true);
        System.out.println("Representation of FitnessMirror: +FitnessMirror");
        System.out.println("generated code is : "+System.identityHashCode(FitnessMirror));
        System.out.println("defined code is : "+FitnessMirror.hashCode());




        PortableScanner portableScanner= new PortableScanner("scan go" ,680,true);
        System.out.println("Representation of PortableScanner: +portableScanner");
        System.out.println("generated code is : "+System.identityHashCode(aIChessBoard));
        System.out.println("defined code is : "+portableScanner.hashCode());



        DigitalRuler digitalRuler= new DigitalRuler(60,true,"ruler");
        System.out.println("Representation of DigitalRuler: +digitalRuler");
        System.out.println("generated code is : "+System.identityHashCode(digitalRuler));
        System.out.println("defined code is : "+digitalRuler.hashCode());



        SmartPetFeeder smartPetFeeder= new SmartPetFeeder("dog",3,true);
        System.out.println("Representation of SmartPetFeeder: +smartPetFeeder");
        System.out.println("generated code is : "+System.identityHashCode(smartPetFeeder));
        System.out.println("defined code is : "+smartPetFeeder.hashCode());



        SmartStoveKnob smartStoveKnob= new SmartStoveKnob(180,true,"bake");
        System.out.println("Representation of SmartStoveKnob: +SmartStoveKnob");
        System.out.println("generated code is : "+System.identityHashCode(smartStoveKnob));
        System.out.println("defined code is : "+smartStoveKnob.hashCode());



        SmartPillow smartPillow= new SmartPillow(true,8,"bamboo");
        System.out.println("Representation of SmartPillow: +SmartPillow");
        System.out.println("generated code is : "+System.identityHashCode(smartPillow));
        System.out.println("defined code is : "+smartPillow.hashCode());



        DigitalPaintPalette digitalPaintPalette= new DigitalPaintPalette(256,true,"art");
        System.out.println("Representation of DigitalPaintPalette: +DigitalPaintPalette");
        System.out.println("generated code is : "+System.identityHashCode(DigitalThermometer));
        System.out.println("defined code is : "+DigitalThermometer.hashCode());



        AIWrittingPad AIWrittingPad= new AIWrittingPad("cursive",true,100);
        System.out.println("Representation of AIWrittingPad: +AIWrittingPad");
        System.out.println("generated code is : "+System.identityHashCode(AIWrittingPad));
        System.out.println("defined code is : "+AIWrittingPad.hashCode());



        SmartPetCollar SmartPetCollar= new SmartPetCollar("max",true,10);
        System.out.println("Representation of SmartPetCollar: +SmartPetCollar");
        System.out.println("generated code is : "+System.identityHashCode(SmartPetCollar));
        System.out.println("defined code is : "+SmartPetCollar.hashCode());



        SmartDeskLamp SmartDeskLamp= new SmartDeskLamp("white",5,true);
        System.out.println("Representation of SmartDeskLamp: +SmartDeskLamp");
        System.out.println("generated code is : "+System.identityHashCode(SmartDeskLamp));
        System.out.println("defined code is : "+SmartDeskLamp.hashCode());




        SmartTrashCan SmartTrashCan= new SmartTrashCan(20, true, true);
        System.out.println("Representation of SmartTrashCan: +SmartTrashCan");
        System.out.println("generated code is : "+System.identityHashCode(SmartTrashCan));
        System.out.println("defined code is : "+SmartTrashCan.hashCode());


        SmartDoorSensor SmartDoorSensor= new SmartDoorSensor("front", true, 12);
        System.out.println("Representation of SmartDoorSensor: +SmartDoorSensor");
        System.out.println("generated code is : "+System.identityHashCode(SmartDoorSensor));
        System.out.println("defined code is : "+SmartDoorSensor.hashCode());



        SmartReceipeBook SmartReceipeBook= new SmartReceipeBook(120, true, "italian");
        System.out.println("Representation of SmartReceipeBook: +SmartReceipeBook");
        System.out.println("generated code is : "+System.identityHashCode(SmartReceipeBook));
        System.out.println("defined code is : "+SmartReceipeBook.hashCode());







    }
}












