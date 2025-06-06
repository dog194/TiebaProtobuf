package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GameAd extends Message {
    public static final String DEFAULT_MOST_NUM = "";
    public static final String DEFAULT_STEP_NUM = "";

    @ProtoField(tag = 1)
    public final GameDetail game_detail;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String most_num;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String step_num;

    public static final class Builder extends Message.Builder<GameAd> {
        public GameDetail game_detail;
        public String most_num;
        public String step_num;

        public Builder() {
        }

        public Builder(GameAd gameAd) {
            super(gameAd);
            if (gameAd == null) {
                return;
            }
            this.game_detail = gameAd.game_detail;
            this.most_num = gameAd.most_num;
            this.step_num = gameAd.step_num;
        }

        @Override // com.squareup.wire.Message.Builder
        public GameAd build(boolean z) {
            return new GameAd(this, z);
        }
    }

    public GameAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.game_detail = builder.game_detail;
            String str = builder.most_num;
            if (str == null) {
                this.most_num = "";
            } else {
                this.most_num = str;
            }
            String str2 = builder.step_num;
            if (str2 == null) {
                this.step_num = "";
                return;
            } else {
                this.step_num = str2;
                return;
            }
        }
        this.game_detail = builder.game_detail;
        this.most_num = builder.most_num;
        this.step_num = builder.step_num;
    }
}