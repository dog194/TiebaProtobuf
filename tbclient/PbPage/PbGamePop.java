package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameDetail;

/* loaded from: classes4.dex */
public final class PbGamePop extends Message {
    public static final String DEFAULT_ALTER_URL = "";
    public static final String DEFAULT_SCHEME_TYPE = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer alter_seconds;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer alter_times;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String alter_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<CommentSimple> comment;

    @ProtoField(tag = 1)
    public final GameDetail game_detail;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String scheme_type;
    public static final Integer DEFAULT_ALTER_TIMES = 0;
    public static final Integer DEFAULT_ALTER_SECONDS = 0;
    public static final List<CommentSimple> DEFAULT_COMMENT = Collections.emptyList();

    public static final class Builder extends Message.Builder<PbGamePop> {
        public Integer alter_seconds;
        public Integer alter_times;
        public String alter_url;
        public List<CommentSimple> comment;
        public GameDetail game_detail;
        public String scheme_type;

        public Builder() {
        }

        public Builder(PbGamePop pbGamePop) {
            super(pbGamePop);
            if (pbGamePop == null) {
                return;
            }
            this.game_detail = pbGamePop.game_detail;
            this.alter_times = pbGamePop.alter_times;
            this.alter_seconds = pbGamePop.alter_seconds;
            this.alter_url = pbGamePop.alter_url;
            this.comment = Message.copyOf(pbGamePop.comment);
            this.scheme_type = pbGamePop.scheme_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbGamePop build(boolean z) {
            return new PbGamePop(this, z);
        }
    }

    public PbGamePop(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.game_detail = builder.game_detail;
            Integer num = builder.alter_times;
            if (num == null) {
                this.alter_times = DEFAULT_ALTER_TIMES;
            } else {
                this.alter_times = num;
            }
            Integer num2 = builder.alter_seconds;
            if (num2 == null) {
                this.alter_seconds = DEFAULT_ALTER_SECONDS;
            } else {
                this.alter_seconds = num2;
            }
            String str = builder.alter_url;
            if (str == null) {
                this.alter_url = "";
            } else {
                this.alter_url = str;
            }
            List<CommentSimple> list = builder.comment;
            if (list == null) {
                this.comment = DEFAULT_COMMENT;
            } else {
                this.comment = Message.immutableCopyOf(list);
            }
            String str2 = builder.scheme_type;
            if (str2 == null) {
                this.scheme_type = "";
                return;
            } else {
                this.scheme_type = str2;
                return;
            }
        }
        this.game_detail = builder.game_detail;
        this.alter_times = builder.alter_times;
        this.alter_seconds = builder.alter_seconds;
        this.alter_url = builder.alter_url;
        this.comment = Message.immutableCopyOf(builder.comment);
        this.scheme_type = builder.scheme_type;
    }
}