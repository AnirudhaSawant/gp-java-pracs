package com.globalpayex.bank.entities;

import com.globalpayex.bank.exception.LowBalException;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNegativeAmtWithdraw() {
        var acc = new Account(1234,AccType.Saving,10000);
        assertThrows(IllegalArgumentException.class,()-> acc.withdraw(-9000));
    }

    @Test
    void testNegativeAccBalance() {
        var acc = new Account(1234,AccType.Saving,10000);
        assertThrows(LowBalException.class,()->acc.withdraw(9500));
        //System.out.println(acc.getDetails());
    }

    @Test
    void testAccount() {
        var acc = new Account(12345698712L,AccType.Current,500000);
        var actual = acc.deposit(100000);
        assertEquals(600000.0,actual);

        try{
            actual = acc.withdraw(100000);
        } catch (LowBalException e) {
            System.out.println(e.getMessage());
        }

        assertEquals(500000.0,actual);

        acc.getDetails().ifPresentOrElse(details -> System.out.println(details.toUpperCase()),()-> System.out.println("Account not initialized"));
    }

    @Test
    void testEmptyAccount() {
        var acc = new Account();
        assertEquals(0.0,acc.getBalance());

        acc.getDetails().ifPresentOrElse(details -> System.out.println(details.toUpperCase()),()-> System.out.println("Account not initialized"));

//        String details = acc.getDetails();
//        if(details != null) {
//            System.out.println(details.toUpperCase());
//        }
//        else{
//            System.out.println("Account is not initialized");
//        }

    }

}