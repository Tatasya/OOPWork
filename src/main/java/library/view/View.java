package library.view;

import library.domain.Library;
import library.service.LibraryManager;
import library.service.LibraryManagerImpl;
import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Created by Family on 11/29/2015.
 */
public class View {

    private static final int EXIT_ITEM = 0;
    private static final int SHOW_LIST_OF_READERS = 1;
    private static final int SHOW_LIST_OF_AVAILABLE_BOOKS = 2;
    private static final int ADD_BOOK_TO_LIBRARY = 3;
    private static final int ADD_READER_TO_LIBRARY = 4;
    private static final int GIVE_BOOK_TO_READER = 5;
    private static final int SHOW_LIST_OF_TAKEN_BOOKS = 6;
    private static final int SHOW_READERS_BOOKS = 7;
    private static final int ADD_READER_TO_BLACK_LIST = 8;
    private static final Logger LOGGER = Logger.getLogger(View.class);


    private LibraryManager libraryManager;
    private Library library;
    private Scanner scan;

    public View(String libraryName) {
        scan = new Scanner(System.in);
        library = new Library(libraryName);
        this.libraryManager = new LibraryManagerImpl(library);
        start();

    }

    private void start() {
        int choice = EXIT_ITEM;
        do {
            showMenu();
            choice = getInput();
            switch (choice) {
                case EXIT_ITEM:
                    System.exit(EXIT_ITEM);
                    break;
                case SHOW_LIST_OF_READERS:
                    System.out.println(libraryManager.getListOfReaders());
                    break;
                case SHOW_LIST_OF_AVAILABLE_BOOKS:
                    System.out.println(libraryManager.getListOfAvailableBooks());
                    break;
                case ADD_BOOK_TO_LIBRARY:
                    break;
                case ADD_READER_TO_LIBRARY:
                    break;
                case GIVE_BOOK_TO_READER:
                    break;
                case SHOW_LIST_OF_TAKEN_BOOKS:
                    break;
                case SHOW_READERS_BOOKS:
                    break;
                case ADD_READER_TO_BLACK_LIST:
                    break;
                default:
                    System.out.println("Wrong selection, please try another one");
                    break;
            }
        } while (choice != EXIT_ITEM);


    }

    private void showMenu() {
        System.out.println("-----------------");
        System.out.println("1. SHOW_LIST_OF_READERS");
        System.out.println("2. SHOW_LIST_OF_AVAILABLE_BOOKS");
        System.out.println("3. ADD_BOOK_TO_LIBRARY");
        System.out.println("4. ADD_READER_TO_LIBRARY");
        System.out.println("5. GIVE_BOOK_TO_READER");
        System.out.println("6. SHOW_LIST_OF_TAKEN_BOOKS");
        System.out.println("7. SHOW_READERS_BOOKS");
        System.out.println("8. ADD_READER_TO_BLACK_LIST");
        System.out.println("0. EXIT THE PROGRAM");
    }

    private int getInput() {
        int res = -1;
        String inputStr = scan.nextLine();
        try {
            res = Integer.parseInt(inputStr);
        } catch (Exception ex) {
            LOGGER.error("invalid input, integer should be typed");
        }
        return res;
    }

}
