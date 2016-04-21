package com.company.test;

import java.util.Random;

/**
 * Created by Palamarjuk on 15.04.2016.
 */
public class MainRan {
    public static void main(String[] args) {
        Random ran = new Random();
        int i;
        for (int j = 0; j < 20; j++) {
            System.out.print((i = ran.nextInt(3)) + ", ");
        }
    }
}
/*Smith	 11. Anderson	 21. Clark	 31. Wright	 41. Mitchell
        2. Johnson	 12. Thomas	 22. Rodriguez	 32. Lopez	 42. Perez
        3. Williams	 13. Jackson	 23. Lewis	 33. Hill	 43. Roberts
        4. Jones	 14. White	 24. Lee	 34. Scott	 44. Turner
        5. Brown	 15. Harris	 25. Walker	 35. Green	 45. Phillips
        6. Davis	 16. Martin	 26. Hall	 36. Adams	 46. Campbell
        7. Miller	 17. Thompson	 27. Allen	 37. Baker	 47. Parker
        8. Wilson	 18. Garcia	 28. Young	 38. Gonzalez	 48. Evans
        9. Moore	 19. Martinez	 29. Hernandez	 39. Nelson	 49. Edwards
        10. Taylor	 20. Robinson	 30. King	 40. Carter	 50. Collins*/

/*
1. James	 11. Christopher	 21. Ronald	 	 1. Mary	 11. Lisa	 21. Michelle
        2. John	 12. Daniel	 22. Anthony	 	 2. Patricia	 12. Nancy	 22. Laura
        3. Robert	 13. Paul	 23. Kevin	 	 3. Linda	 13. Karen	 23. Sarah
        4. Michael	 14. Mark	 24. Jason	 	 4. Barbara	 14. Betty	 24. Kimberly
        5. William	 15. Donald	 25. Jeff	 	 5. Elizabeth	 15. Helen	 25. Deborah
        6. David	 16. George	 	 	 6. Jennifer	 16. Sandra
        7. Richard	 17. Kenneth	 	 7. Maria	 17. Donna
        8. Charles	 18. Steven	 	 8. Susan	 18. Carol
        9. Joseph	 19. Edward	 	 9. Margaret	 19. Ruth
        10. Thomas	 20. Brian*/
