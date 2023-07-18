package com.netease.nim.camellia.hot.key.common.netty.pack;

import com.netease.nim.camellia.hot.key.common.model.KeyCounter;
import com.netease.nim.camellia.hot.key.common.model.KeyAction;
import com.netease.nim.camellia.hot.key.common.netty.codec.ArrayMable;
import com.netease.nim.camellia.hot.key.common.netty.codec.Pack;
import com.netease.nim.camellia.hot.key.common.netty.codec.Props;
import com.netease.nim.camellia.hot.key.common.netty.codec.Unpack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caojiajun on 2023/5/8
 */
public class PushPack extends HotKeyPackBody {

    private static enum Tag {
        namespace(1),
        key(2),
        action(3),
        count(4),
        ;

        private final int value;

        Tag(int value) {
            this.value = value;
        }
    }

    private List<KeyCounter> list;

    public PushPack(List<KeyCounter> list) {
        this.list = list;
    }

    public PushPack() {
    }

    public List<KeyCounter> getList() {
        return list;
    }

    @Override
    public void marshal(Pack pack) {
        ArrayMable<Props> arrayMable = new ArrayMable<>(Props.class);
        for (KeyCounter counter : list) {
            Props props = new Props();
            props.put(Tag.namespace.value, counter.getNamespace());
            props.put(Tag.key.value, counter.getKey());
            props.putInteger(Tag.action.value, counter.getAction().getValue());
            props.putLong(Tag.count.value, counter.getCount());
            arrayMable.add(props);
        }
        pack.putMarshallable(arrayMable);
    }

    @Override
    public void unmarshal(Unpack unpack) {
        ArrayMable<Props> arrayMable = new ArrayMable<>(Props.class);
        unpack.popMarshallable(arrayMable);
        list = new ArrayList<>();
        for (Props props : arrayMable.list) {
            KeyCounter counter = new KeyCounter();
            counter.setNamespace(props.get(Tag.namespace.value));
            counter.setKey(props.get(Tag.key.value));
            counter.setAction(KeyAction.getByValue(props.getInteger(Tag.action.value)));
            counter.setCount(props.getLong(Tag.count.value));
            list.add(counter);
        }
    }
}
