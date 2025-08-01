package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_RECOMMEND_EXT = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer priv_thread;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String recommend_ext;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SimpleForum> recommend_forum_list;
    public static final List<SimpleForum> DEFAULT_RECOMMEND_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_PRIV_THREAD = 0;

    public static final class Builder extends Message.Builder<DataRes> {
        public Integer priv_thread;
        public String recommend_ext;
        public List<SimpleForum> recommend_forum_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend_forum_list = Message.copyOf(dataRes.recommend_forum_list);
            this.recommend_ext = dataRes.recommend_ext;
            this.priv_thread = dataRes.priv_thread;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<SimpleForum> list = builder.recommend_forum_list;
            if (list == null) {
                this.recommend_forum_list = DEFAULT_RECOMMEND_FORUM_LIST;
            } else {
                this.recommend_forum_list = Message.immutableCopyOf(list);
            }
            String str = builder.recommend_ext;
            if (str == null) {
                this.recommend_ext = "";
            } else {
                this.recommend_ext = str;
            }
            Integer num = builder.priv_thread;
            if (num == null) {
                this.priv_thread = DEFAULT_PRIV_THREAD;
                return;
            } else {
                this.priv_thread = num;
                return;
            }
        }
        this.recommend_forum_list = Message.immutableCopyOf(builder.recommend_forum_list);
        this.recommend_ext = builder.recommend_ext;
        this.priv_thread = builder.priv_thread;
    }
}