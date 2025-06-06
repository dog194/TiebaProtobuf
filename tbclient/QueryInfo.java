package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class QueryInfo extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer insert_pos;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<QueryBase> querys;
    public static final List<QueryBase> DEFAULT_QUERYS = Collections.emptyList();
    public static final Integer DEFAULT_INSERT_POS = 0;

    public static final class Builder extends Message.Builder<QueryInfo> {
        public Integer insert_pos;
        public List<QueryBase> querys;

        public Builder() {
        }

        public Builder(QueryInfo queryInfo) {
            super(queryInfo);
            if (queryInfo == null) {
                return;
            }
            this.querys = Message.copyOf(queryInfo.querys);
            this.insert_pos = queryInfo.insert_pos;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryInfo build(boolean z) {
            return new QueryInfo(this, z);
        }
    }

    public QueryInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<QueryBase> list = builder.querys;
            if (list == null) {
                this.querys = DEFAULT_QUERYS;
            } else {
                this.querys = Message.immutableCopyOf(list);
            }
            Integer num = builder.insert_pos;
            if (num == null) {
                this.insert_pos = DEFAULT_INSERT_POS;
                return;
            } else {
                this.insert_pos = num;
                return;
            }
        }
        this.querys = Message.immutableCopyOf(builder.querys);
        this.insert_pos = builder.insert_pos;
    }
}