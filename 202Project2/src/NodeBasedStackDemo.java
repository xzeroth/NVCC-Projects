import java.util.Scanner;

public class NodeBasedStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnboundedStackInterface<CompactDisc> notEnglish = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface<CompactDisc> rush = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface<CompactDisc> pinkFloyd = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface<CompactDisc> ironMaiden = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface<CompactDisc> english = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface<CompactDisc> otherDisc = new NodeBasedStack<CompactDisc>();
		UnboundedStackInterface[] arrayDisc = { notEnglish, english, rush, pinkFloyd, ironMaiden, otherDisc };
		Scanner input = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Please choose one of the following");
			System.out.println("\t1. Enter CD information");
			System.out.println("\t2. Look at newest CD added in a collection");
			System.out.println("\t3. Remove newest added CD in a collection");
			System.out.println("\t4. Content list of a collection");
			System.out.println("\t5. Size of a collection");
			System.out.println("\t6. Total number of CDs in all collections");
			System.out.println("\t7. End Program");

			choice = input.nextInt();
			input.nextLine();
			if (choice == 1) {
				CompactDisc tempDisc = new CompactDisc();

				System.out.println("Enter name of the artist");
				tempDisc.setArtist(input.nextLine());
				System.out.println("Enter name of the album");
				tempDisc.setAlbum(input.nextLine());
				System.out.println("Enter language type");
				tempDisc.setLanguage(input.next());

				switch (tempDisc.getArtist().toLowerCase()) {
				case "rush":
					arrayDisc[2].push(tempDisc);
					System.out.println(tempDisc.toString() + "Added to Rush collection");
					break;
				case "pink floyd":
					arrayDisc[3].push(tempDisc);
					System.out.println(tempDisc.toString() + "Added to Pink Floyd collection");
					break;
				case "iron maiden":
					arrayDisc[4].push(tempDisc);
					System.out.println(tempDisc.toString() + "Added to Iron Maiden collection");
					break;
				default:
					switch (tempDisc.getLanguage().toLowerCase()) {
					case "english":
						arrayDisc[1].push(tempDisc);
						System.out.println(tempDisc.toString() + "Added to English collection");
						break;
					default:
						arrayDisc[0].push(tempDisc);
						System.out.println(tempDisc.toString() + "Added to Other Language collection");
						break;
					}
					break;
				}

			} else if (choice == 2) {
				System.out.println(
						  "\tChoose one of the following collections\n" 
						+ "\t\t1. Collection - Rush\n"
						+ "\t\t2. Collection - Pink Floyd\n" 
						+ "\t\t3. Collection - Iron Maiden\n"
						+ "\t\t4. Collection - English\n" 
						+ "\t\t5. Collection - Other Language\n"
						+ "\t\t6. Collection - Other Disc");
				int collectionChoice = input.nextInt();
				try {
					switch (collectionChoice) {
					case 1:
						System.out.printf("Newest from %s collection is %s", "Rush", arrayDisc[2].peek());
						break;
					case 2:
						System.out.printf("Newest from %s collection is %s", "Pink Floyd", arrayDisc[3].peek());
						break;
					case 3:
						System.out.printf("Newest from %s collection is %s", "Iron Maiden", arrayDisc[4].peek());
						break;
					case 4:
						System.out.printf("Newest from %s collection is %s", "English", arrayDisc[1].peek());
						break;
					case 5:
						System.out.printf("Newest from %s collection is %s", "other language", arrayDisc[0].peek());
						break;
					case 6:
						System.out.printf("Newest from %s collection is %s", "other disc", arrayDisc[5].peek());
						break;
					default:
						System.out.println("Invalid input");
						break;
					}
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());

				}
			} else if (choice == 3) {
				System.out.println(
						  "\tChoose one of the following collections\n" 
						+ "\t\t1. Collection - Rush\n"
						+ "\t\t2. Collection - Pink Floyd\n" 
						+ "\t\t3. Collection - Iron Maiden\n"
						+ "\t\t4. Collection - English\n" 
						+ "\t\t5. Collection - Other Language\n"
						+ "\t\t6. Collection - Other Disc");
				int collectionChoice = input.nextInt();
				try {
					switch (collectionChoice) {
					case 1:
						System.out.printf("Newest from %s collection is %s removed", "Rush", arrayDisc[2].peek());
						arrayDisc[5].push(arrayDisc[2].peek());
						arrayDisc[2].pop();
						break;
					case 2:
						System.out.printf("Newest from %s collection is %s removed", "Pink Floyd", arrayDisc[3].peek());
						arrayDisc[5].push(arrayDisc[3].peek());
						arrayDisc[3].pop();
						break;
					case 3:
						System.out.printf("Newest from %s collection is %s removed", "Iron Maiden",
								arrayDisc[4].peek());
						arrayDisc[5].push(arrayDisc[4].peek());
						arrayDisc[4].pop();
						break;
					case 4:
						System.out.printf("Newest from %s collection is %s removed", "English", arrayDisc[1].peek());
						arrayDisc[5].push(arrayDisc[1].peek());
						arrayDisc[1].pop();
						break;
					case 5:
						System.out.printf("Newest from %s collection is %s removed", "other language",
								arrayDisc[0].peek());
						arrayDisc[5].push(arrayDisc[0].peek());
						arrayDisc[0].pop();
						break;
					case 6:
						System.out.printf("Newest from %s collection is %s removed", "other disc", arrayDisc[6].peek());
						arrayDisc[6].pop();
						break;
					default:
						System.out.println("Invalid input");
						break;
					}
				} catch (StackEmptyException e) {
					System.out.println(e.getMessage());

				}
			} else if (choice == 4) {
				System.out.println(
						  "\tChoose one of the following collections\n" 
						+ "\t\t1. Collection - Rush\n"
						+ "\t\t2. Collection - Pink Floyd\n" 
						+ "\t\t3. Collection - Iron Maiden\n"
						+ "\t\t4. Collection - English\n" 
						+ "\t\t5. Collection - Other Language\n"
						+ "\t\t6. Collection - Other disc");
				int collectionChoice = input.nextInt();
				NodeBasedStack<CompactDisc> tempDisc = new NodeBasedStack();
				switch (collectionChoice) {
				case 1:
					try {
						while (true) {
							System.out.println(rush.peek());
							tempDisc.push(rush.peek());
							rush.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							rush.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					break;
				case 2:
					try {
						while (true) {
							System.out.println(pinkFloyd.peek());
							tempDisc.push(pinkFloyd.peek());
							pinkFloyd.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							pinkFloyd.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					break;
				case 3:
					try {
						while (true) {
							System.out.println(ironMaiden.peek());
							tempDisc.push(ironMaiden.peek());
							ironMaiden.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							ironMaiden.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					break;
				case 4:
					try {
						while (true) {
							System.out.println(english.peek());
							tempDisc.push(english.peek());
							english.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							english.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					break;
				case 5:
					try {
						while (true) {
							System.out.println(notEnglish.peek());
							tempDisc.push(notEnglish.peek());
							notEnglish.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							notEnglish.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}

					break;
				case 6:
					try {
						while (true) {
							System.out.println(otherDisc.peek());
							tempDisc.push(otherDisc.peek());
							otherDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					try {
						while (true) {
							otherDisc.push(tempDisc.peek());
							tempDisc.pop();
						}
					} catch (StackEmptyException e) {
						System.out.println();
					}
					break;
				default:
					System.out.println("Invalid input");
					break;
				}

			} else if (choice == 5) {
				System.out.println(
						  "\tChoose one of the following collections\n" 
						+ "\t\t1. Collection - Rush\n"
						+ "\t\t2. Collection - Pink Floyd\n" 
						+ "\t\t3. Collection - Iron Maiden\n"
						+ "\t\t4. Collection - English\n" 
						+ "\t\t5. Collection - Other Language\n"
						+ "\t\t6. Collection - Other Disc");
				int collectionChoice = input.nextInt();

				switch (collectionChoice) {
				case 1:
					System.out.printf("There are %s CD(s) in this collection", arrayDisc[2].size());
					break;
				case 2:
					System.out.printf("There are %s CD(s) in this collection", arrayDisc[3].size());
					break;
				case 3:
					System.out.printf("There are %s CD(s) in this collection", arrayDisc[4].size());
					break;
				case 4:
					System.out.printf("There are %s CD(s) in this collection", arrayDisc[1].size());
					break;
				case 5:
					System.out.printf("There are %s CD(s) in this collection\n", arrayDisc[0].size());
					break;
				case 6:
					System.out.printf("There are %s CD(s) in this collection\n", arrayDisc[5].size());
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
			} else if (choice == 6) {
				int totalSize = 0;
				for (int n = 0; n < arrayDisc.length - 1; n++) {
					totalSize += arrayDisc[n].size();
				}
				System.out.printf("There are total of %s CD(s) in all the collections\n", totalSize);
			} else if (choice == 7) {
				System.out.println("Ending program");
			} else {
				System.out.println("Invalid input");
			}

		} while (choice != 7);

	}

}
