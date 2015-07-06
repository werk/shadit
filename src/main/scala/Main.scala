import org.widok._
import org.widok.bindings.HTML
import dk.mzw.accelemation.ToGlsl


object Main extends PageApplication {
    def view() = {
        Inline(
            HTML.Heading.Level1("GLSL code")
            , HTML.Paragraph(ToGlsl(Spiral.apply))
            , HTML.Paragraph(ToGlsl(TimeLens.apply))
        )
    }

    def ready() {
        log("Page loaded.")
    }
}