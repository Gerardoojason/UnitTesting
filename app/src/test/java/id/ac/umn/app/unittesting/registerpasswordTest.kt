package id.ac.umn.app.unittesting

//import junit.framework.TestCase

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class registerpasswordTest {


    @Test
    fun `password dan konfirmasi password berbeda`() {
        val result  = registerpassword.validpassword(
            "Jakarta1",
        "Jakarta2"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password tidak memiliki 8 karakter `(){
        val result = registerpassword.validpassword(
            "Jak1",
        "Jak1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password tidak memiliki minimal 1 huruf besar`(){
        val result = registerpassword.validpassword(
            "jakarta1",
        "jakarta1"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password tidak memiliki minimal 1 huruf kecil`(){
        val result = registerpassword.validpassword(
            "JAKARTA1",
            "JAKARTA1"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password mempunyai minimal 1 angka returns true`(){
        val result = registerpassword.validpassword(
            "Jakarta123",
            "Jakarta123"
        )
        assertThat(result).isFalse()
    }
}