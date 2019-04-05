public class VendingMachineTest{
  VendingMachine vm = new VendingMachine();
  /*Input[] inputs = {
    Money.quarter,
    Money.quarter,
    Money.dollar,
    Money.dollar,
    FirstDigit.A,
    SecondDigit.two,
    FirstDigit.A,
    SecondDigit.two,
    FirstDigit.C,
    SecondDigit.three,
    FirstDigit.D,
    SecondDigit.one,
    Quit.quit,
  };*/
  Input[] inputs = {
		    Money.quarter,
		    Money.quarter,
		    Money.dollar,
		    Money.dollar,
		    FirstDigit.A,
		    SecondDigit.two,
		    FirstDigit.A,
		    SecondDigit.two,
		    FirstDigit.C,
		    SecondDigit.three,
		    FirstDigit.D,
		    SecondDigit.one,
		    Quit.quit,
		  };
  public void test() {
    for(int i = 0; i < inputs.length; i++)
      vm.nextState(inputs[i]);
  }
  public static void main(String[] args) {
    new VendingMachineTest().test();
  }
}