package net.jhashimoto.library;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Member {
	private final Lent lent; // TODO 貸出をコレクションにする
	private final MemberKinds memberKinds;

	public int getAvailableLentCount() {
		// TODO ロジック実装
		return 0;
	}

}
