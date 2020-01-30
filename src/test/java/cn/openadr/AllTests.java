package cn.openadr;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({EventTest.class, OptTest.class, PollTest.class, RegTest.class, RptTest.class})
public class AllTests {
}
