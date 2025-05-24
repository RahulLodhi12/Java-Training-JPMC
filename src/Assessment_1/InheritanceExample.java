package Assessment_1;

public class InheritanceExample {
    public static void main(String[] args){


//        Item item = new Item(); //error-> abstract class cannot be instantiated

//        Item item = new Book(); //Type is "Item", object is "new Book()" and "item" is refVar.
//
//        System.out.println(item.toString()); //item.toString() calls to toString() method of java.lang.Object class, need override
//        item.addItem();

//        item = new JournalPaper(); //kiska type toh "Item" hi hai.

        Book book = new Book();
        book.setIdentificationNumber(101);
        book.setTitle("Breaking Bad");
        book.setNoOfCopies(15);
        book.setAuthor("Vince Gilligan");

        System.out.println(book.toString());

        JournalPaper journalPaper = new JournalPaper();
        journalPaper.setIdentificationNumber(102);
        journalPaper.setTitle("Squid Game");
        journalPaper.setNoOfCopies(25);
        journalPaper.setAuthor("Kim-ju");
        journalPaper.setYearPublished(2022);

        System.out.println(journalPaper.toString());

        Video video = new Video();
        video.setIdentificationNumber(103);
        video.setTitle("Tenet");
        video.setNoOfCopies(12);
        video.setRuntime(230);
        video.setDirector("Nolan");
        video.setGenre("Crime");
        video.setYearReleased(2011);

        System.out.println(video.toString());

        CD cd = new CD();
        cd.setIdentificationNumber(104);
        cd.setTitle("IronMan");
        cd.setNoOfCopies(19);
        cd.setRuntime(300);
        cd.setArtist("Tonk Stark");
        cd.setGenre("Action");

        System.out.println(cd); //cd implicitly call to the cd.toString() method

    }
}

abstract class Item{
    private int identificationNumber;
    private String title;
    private int noOfCopies;

//    public Item(){
//    }
//
//    public Item(int identificationNumber, String title, int noOfCopies){
//        super(); //calling super class java.lang.Object
//        this.identificationNumber = identificationNumber;
//        this.title = title;
//        this.noOfCopies = noOfCopies;
//    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @Override
//    public String toString() {
//        return getIdentificationNumber() + " " + getTitle() + " " + getNoOfCopies();
//    }

    public void addItem(){
        System.out.println("Item added..");
    }
}

abstract class WrittenItem extends Item{
    private String author;

//    public WrittenItem(){
//        super(101,"Breaking Bad",15);
//    }

//    public WrittenItem(String author){
//        this.author = author;
//    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Book extends WrittenItem{
    public Book(){
        super();
    }

    public String toString(){
        return getIdentificationNumber() + " " + getTitle() + " " + getNoOfCopies() + " " + getAuthor();
    }
}

class JournalPaper extends WrittenItem{
    private int yearPublished;

//    public JournalPaper(int yearPublished){
//        super();
//        this.yearPublished = yearPublished;
//    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return getIdentificationNumber()+" "+getTitle() +" "+getNoOfCopies()+" "+getAuthor()+" "+getYearPublished();
    }
}

abstract class MediaItem extends Item{
    private int runtime;

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }
}

class Video extends MediaItem{
    private String director;
    private String genre;
    private int yearReleased;

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return getIdentificationNumber() + " " + getTitle() +" " + getNoOfCopies() + " " + getRuntime() + " " + getDirector() + " " + getGenre() + " " + getYearReleased();
    }
}

class CD extends MediaItem{
    private String artist;
    private String genre;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return getIdentificationNumber() + " " + getTitle() +" " + getNoOfCopies() + " " + getRuntime() + " " + getArtist() + " " + getGenre();
    }
}

