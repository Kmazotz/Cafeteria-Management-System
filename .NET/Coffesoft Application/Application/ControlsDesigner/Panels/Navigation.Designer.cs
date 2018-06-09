using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ControlsDesigner.Panels
{
    public partial class Navigation
    {
        private void InitializeComponent()
        {
            this.SuspendLayout();
            // 
            // NavigationBar
            // 
            this.Dock = System.Windows.Forms.DockStyle.Top;
            this.TabStop = true;
            this.SizeChanged += new System.EventHandler(this.Navigation_SizeChanged);
            this.ResumeLayout(false);
        }
    }
}
