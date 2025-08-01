package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Terminal extends Message {

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer client;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pc;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer wap;
    public static final Integer DEFAULT_PC = 0;
    public static final Integer DEFAULT_WAP = 0;
    public static final Integer DEFAULT_CLIENT = 0;

    public static final class Builder extends Message.Builder<Terminal> {
        public Integer client;
        public Integer pc;
        public Integer wap;

        public Builder() {
        }

        public Builder(Terminal terminal) {
            super(terminal);
            if (terminal == null) {
                return;
            }
            this.pc = terminal.pc;
            this.wap = terminal.wap;
            this.client = terminal.client;
        }

        @Override // com.squareup.wire.Message.Builder
        public Terminal build(boolean z) {
            return new Terminal(this, z);
        }
    }

    public Terminal(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pc;
            if (num == null) {
                this.pc = DEFAULT_PC;
            } else {
                this.pc = num;
            }
            Integer num2 = builder.wap;
            if (num2 == null) {
                this.wap = DEFAULT_WAP;
            } else {
                this.wap = num2;
            }
            Integer num3 = builder.client;
            if (num3 == null) {
                this.client = DEFAULT_CLIENT;
                return;
            } else {
                this.client = num3;
                return;
            }
        }
        this.pc = builder.pc;
        this.wap = builder.wap;
        this.client = builder.client;
    }
}