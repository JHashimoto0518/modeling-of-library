package net.jhashimoto.library;

public enum MemberKinds {
	Adult {
		@Override
		public long getAvailableLentCount(long delayDays) {
			if (delayDays < 3) {
				return 5;
			} else if (delayDays < 7) {
				return 0;
			}

			return 0;
		}
	},
	Child {
		@Override
		public long getAvailableLentCount(long delayDays) {
			if (delayDays < 3) {
				return 7;
			} else if (delayDays < 7) {
				return 4;
			}
			return 0;
		}
	};

	public abstract long getAvailableLentCount(long delayDays);
}
