package id.ac.umn.app.unittesting

import junit.framework.Assert.assertEquals
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class aritmatikaTest {
    lateinit var tesaritmatika: aritmatika
    @Before
    fun setup(){
        tesaritmatika = aritmatika()
    }
    @Test
    fun testSum() {
        val aktual =11
        assertEquals(aktual, tesaritmatika.sum(1, 10))
    }


}