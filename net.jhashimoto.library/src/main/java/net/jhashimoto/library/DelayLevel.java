/**
 *
 */
package net.jhashimoto.library;

/**
 * @author Junichi
 *
 */
public enum DelayLevel {
	None {
		@Override
		public int getDelayLimit() {
			return 3;
		}
	},
	Right {
		@Override
		public int getDelayLimit() {
			return 7;
		}
	},
	Cretical {
		@Override
		public int getDelayLimit() {
			return 999;
		}
	};


	public abstract int getDelayLimit();
}
