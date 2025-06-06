package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<App> frs;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<App> pb_banner;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<App> pb_comment;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<App> recom;
    public static final List<App> DEFAULT_RECOM = Collections.emptyList();
    public static final List<App> DEFAULT_FRS = Collections.emptyList();
    public static final List<App> DEFAULT_PB_BANNER = Collections.emptyList();
    public static final List<App> DEFAULT_PB_COMMENT = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public List<App> frs;
        public List<App> pb_banner;
        public List<App> pb_comment;
        public List<App> recom;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recom = Message.copyOf(dataRes.recom);
            this.frs = Message.copyOf(dataRes.frs);
            this.pb_banner = Message.copyOf(dataRes.pb_banner);
            this.pb_comment = Message.copyOf(dataRes.pb_comment);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<App> list = builder.recom;
            if (list == null) {
                this.recom = DEFAULT_RECOM;
            } else {
                this.recom = Message.immutableCopyOf(list);
            }
            List<App> list2 = builder.frs;
            if (list2 == null) {
                this.frs = DEFAULT_FRS;
            } else {
                this.frs = Message.immutableCopyOf(list2);
            }
            List<App> list3 = builder.pb_banner;
            if (list3 == null) {
                this.pb_banner = DEFAULT_PB_BANNER;
            } else {
                this.pb_banner = Message.immutableCopyOf(list3);
            }
            List<App> list4 = builder.pb_comment;
            if (list4 == null) {
                this.pb_comment = DEFAULT_PB_COMMENT;
                return;
            } else {
                this.pb_comment = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.recom = Message.immutableCopyOf(builder.recom);
        this.frs = Message.immutableCopyOf(builder.frs);
        this.pb_banner = Message.immutableCopyOf(builder.pb_banner);
        this.pb_comment = Message.immutableCopyOf(builder.pb_comment);
    }
}