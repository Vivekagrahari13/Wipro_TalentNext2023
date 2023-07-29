

package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//test Agrahari
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class TestSuite {
    // No code needed here
}
