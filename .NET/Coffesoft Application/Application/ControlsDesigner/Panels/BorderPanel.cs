using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ControlsDesigner.Panels
{
    public class BorderPanel : Panel
    {
        public Color BorderColor { get; set; }

        public BorderPanel()
        {
            SetStyle(ControlStyles.UserPaint | ControlStyles.ResizeRedraw | ControlStyles.DoubleBuffer | ControlStyles.AllPaintingInWmPaint, true);
        }

        protected override void OnPaint(PaintEventArgs e)
        {
            using (SolidBrush brush = new SolidBrush(BackColor))
            {
                e.Graphics.FillRectangle(brush, ClientRectangle);
                e.Graphics.DrawRectangle(new Pen(BorderColor,1f), 0, 0, ClientSize.Width - 1, ClientSize.Height - 1);
            }
        }
    }
}
