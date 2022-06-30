// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;



/** Overlapping pair */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class GIM_PAIR extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GIM_PAIR(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GIM_PAIR(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GIM_PAIR position(long position) {
        return (GIM_PAIR)super.position(position);
    }
    @Override public GIM_PAIR getPointer(long i) {
        return new GIM_PAIR((Pointer)this).offsetAddress(i);
    }

        public native int m_index1(); public native GIM_PAIR m_index1(int setter);
        public native int m_index2(); public native GIM_PAIR m_index2(int setter);
        public GIM_PAIR() { super((Pointer)null); allocate(); }
        private native void allocate();

        public GIM_PAIR(@Const @ByRef GIM_PAIR p) { super((Pointer)null); allocate(p); }
        private native void allocate(@Const @ByRef GIM_PAIR p);

        public GIM_PAIR(int index1, int index2) { super((Pointer)null); allocate(index1, index2); }
        private native void allocate(int index1, int index2);
}