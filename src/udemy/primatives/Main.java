package udemy.primatives;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinIntValue = Integer.MIN_VALUE;
	int  myMaxIntValue = 2_147_483_647;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue= (short) (myMinShortValue /2);

        byte challengeByte = 2;
        short challengeShort = 2543;
        int challengeInt = 323454;
        long challengeLong = (50000 + ((challengeByte + challengeShort + challengeInt) * 10));


    }
}