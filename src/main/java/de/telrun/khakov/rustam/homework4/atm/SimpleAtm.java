package de.telrun.khakov.rustam.homework4.atm;

import de.telrun.khakov.rustam.homework2.card.CreditCard;

/**
 * @author Rustam Khakov
 */
public final class SimpleAtm extends Atm {

	public SimpleAtm(double sum, String model) {
		super(sum, model);
	}

	@Override
	public void doOperation(int operationNumber, CreditCard card) {
		if (operationNumber == 1) {
			System.out.println("введите сумму и пинкод для снятия");
			//Scanner и считаем
		}else {
			System.out.println("введите сумму и пинкод для пополнения");
			//Scanner и считаем
		}
	}

	@Override
	public void deposit(CreditCard card, int pin, int sum) {
		boolean isSuccess = card.deposit(sum, pin);
		if (isSuccess) {
			this.sum += sum;
		} else {
			System.out.println("not success");
		}
	}

	@Override
	public void withdraw(CreditCard card, int pin, int sum) {
		if (sum < this.sum) {
			boolean isSuccess = card.withdraw(sum, pin);
			if (isSuccess) {
				this.sum -= sum;
			} else {
				System.out.println("not success");
			}
		}
	}
}
