// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class RequantizeLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public RequantizeLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public RequantizeLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RequantizeLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public RequantizeLayer position(long position) {
            return (RequantizeLayer)super.position(position);
        }
        @Override public RequantizeLayer getPointer(long i) {
            return new RequantizeLayer((Pointer)this).offsetAddress(i);
        }
    
        public native float scale(); public native RequantizeLayer scale(float setter);
        public native float shift(); public native RequantizeLayer shift(float setter);
        public static native @Ptr RequantizeLayer create(@Const @ByRef LayerParams params);
    }