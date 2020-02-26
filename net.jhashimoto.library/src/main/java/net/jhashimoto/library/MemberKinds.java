package net.jhashimoto.library;

public enum MemberKinds {
	Adult {
		@Override
		public int getLimitCount() {
			return 5;
		}
	},
	Child {
		@Override
		public int getLimitCount() {
			return 7;
		}
	};

	public abstract int getLimitCount();
}
