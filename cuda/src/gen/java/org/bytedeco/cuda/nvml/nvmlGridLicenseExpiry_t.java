// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to store license expiry date and time values
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGridLicenseExpiry_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGridLicenseExpiry_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGridLicenseExpiry_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGridLicenseExpiry_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGridLicenseExpiry_t position(long position) {
        return (nvmlGridLicenseExpiry_t)super.position(position);
    }
    @Override public nvmlGridLicenseExpiry_t getPointer(long i) {
        return new nvmlGridLicenseExpiry_t((Pointer)this).offsetAddress(i);
    }

    /** Year value of license expiry */
    public native @Cast("unsigned int") int year(); public native nvmlGridLicenseExpiry_t year(int setter);
    /** Month value of license expiry */
    public native @Cast("unsigned short") short month(); public native nvmlGridLicenseExpiry_t month(short setter);
    /** Day value of license expiry */
    public native @Cast("unsigned short") short day(); public native nvmlGridLicenseExpiry_t day(short setter);
    /** Hour value of license expiry */
    public native @Cast("unsigned short") short hour(); public native nvmlGridLicenseExpiry_t hour(short setter);
    /** Minutes value of license expiry */
    public native @Cast("unsigned short") short min(); public native nvmlGridLicenseExpiry_t min(short setter);
    /** Seconds value of license expiry */
    public native @Cast("unsigned short") short sec(); public native nvmlGridLicenseExpiry_t sec(short setter);
    /** License expiry status */
    public native @Cast("unsigned char") byte status(); public native nvmlGridLicenseExpiry_t status(byte setter);
}