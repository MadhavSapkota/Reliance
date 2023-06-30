package com.reliance.yeticarpet.apputlis
import android.annotation.SuppressLint
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.reflect.Field

object BottomNavigationViewHelper {
    @SuppressLint("RestrictedApi")
    fun disableShiftMode(view: BottomNavigationView) {
        val menuView: BottomNavigationMenuView=view.getChildAt(0) as BottomNavigationMenuView
        try {
            val shiftingMode: Field=menuView.javaClass.getDeclaredField("mShiftingMode");
            shiftingMode.isAccessible=true
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.isAccessible=false
            for (i in 0 until menuView.childCount) {
                val item: BottomNavigationItemView=
                    menuView.getChildAt(i) as BottomNavigationItemView
                item.setShifting(false)
                item.setChecked(item.itemData!!.isChecked)
            }
        } catch (e: NoSuchFieldException) {

        } catch (e: IllegalAccessException) {

        }
    }
}